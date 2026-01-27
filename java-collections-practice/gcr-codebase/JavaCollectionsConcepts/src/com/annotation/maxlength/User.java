package com.annotation.maxlength;

public class User {

	@MaxLength(10)
    private String username;

    public User(String username) {
        this.username = username;

        // Validating using reflection
        validateFields();
    }

    //method to validate fields
    private void validateFields() {
        try {
            for (var field : this.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(MaxLength.class)) {
                    MaxLength maxLength = field.getAnnotation(MaxLength.class);
                    field.setAccessible(true); // allow access to private fields
                    Object value = field.get(this);

                    if (value instanceof String) {
                        String strValue = (String) value;
                        if (strValue.length() > maxLength.value()) {
                            throw new IllegalArgumentException(
                                "Field '" + field.getName() + "' exceeds max length of " + maxLength.value()
                            );
                        }
                    }
                }
            }
        } 
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    //method to get user name
    public String getUsername() {
        return username;
    }

}
