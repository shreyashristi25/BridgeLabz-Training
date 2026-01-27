package com.dealtracker;
import java.io.* ;
import java.time.* ;
import java.util.regex.* ;
import java.util.* ;

public class DealTracker {
		
	private static final Pattern CODE_PATTERN = Pattern.compile("DealCode:\\s*(.*)");
	private static final Pattern DATE_PATTERN = Pattern.compile("ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})");
	private static final Pattern DISCOUNT_PATTERN = Pattern.compile("Discount:\\s*(\\d+)%");
	private static final Pattern MIN_PATTERN = Pattern.compile("MinimumPurchase:\\s*(\\d+)");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//taking user input and displaying result accordingly
		System.out.print("Enter number of deal files: ");
		int n = Integer.parseInt(sc.nextLine());

		Map<String, Deal> validDeals = new HashMap<>();
		Set<String> dealCodes = new HashSet<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter path for deal file " + (i+1) + ": ");
			String path = sc.nextLine();

			try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
				String code = null, date = null;
				int discount = 0, minPurchase = 0;

				String line;
				while ((line = br.readLine()) != null) {
					Matcher m;
					if ((m = CODE_PATTERN.matcher(line)).matches()) code = m.group(1);
					else if ((m = DATE_PATTERN.matcher(line)).matches()) date = m.group(1);
					else if ((m = DISCOUNT_PATTERN.matcher(line)).matches()) discount = Integer.parseInt(m.group(1));
					else if ((m = MIN_PATTERN.matcher(line)).matches()) minPurchase = Integer.parseInt(m.group(1));
	          	}
				
				if (code == null || date == null) {
					System.out.println("Invalid deal format in file: " + path);
					continue;
	            }
				
				Deal deal = new Deal(code, date, discount, minPurchase);

                if (deal.getValidTill().isBefore(LocalDate.now())) {
                    System.out.println("Expired deal skipped: " + deal);
                    continue;
                }

                if (!dealCodes.add(deal.getCode())) {
                    System.out.println("Duplicate deal skipped: " + deal.getCode());
                    continue;
                }

                validDeals.put(deal.getCode(), deal);

            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }

        List<Deal> sortedDeals = new ArrayList<>(validDeals.values());
        sortedDeals.sort(Comparator.comparingInt(Deal::getDiscountValue).reversed());

        System.out.println("\n--- Valid Deals Sorted by Discount ---");
        sortedDeals.forEach(System.out::println);




	}

}
