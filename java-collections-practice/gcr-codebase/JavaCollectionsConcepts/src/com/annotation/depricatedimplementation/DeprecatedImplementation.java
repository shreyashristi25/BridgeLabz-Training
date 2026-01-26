package com.annotation.depricatedimplementation;

public class DeprecatedImplementation {

	public static void main(String[] args) {
		LegacyAPI api = new LegacyAPI();

        // Calling deprecated method and new method
        api.oldFeature();

        api.newFeature();


	}

}
