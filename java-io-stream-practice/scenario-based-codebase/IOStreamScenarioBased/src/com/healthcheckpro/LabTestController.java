package com.healthcheckpro;
import java.lang.annotation.*;

public class LabTestController {

	@PublicAPI(description = "Fetch lab test results")
    @RequireAuth(role = "DOCTOR")
    public void getLabResults() {}

    @PublicAPI(description = "Book a lab test")
    public void bookLabTest() {}

    // Missing annotation intentionally
    public void internalHelperMethod() {}

}
