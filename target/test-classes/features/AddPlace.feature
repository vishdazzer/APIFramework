Feature: Validate Place API'S


Scenario: Verify is place is been added successfully using add place api

	Given Add Place Payload
	When user calls "AddPlaceApi" with post http request 
	Then the api call is success with status code 200
	And "status" in response body is "ok"
	And "scope" in response body is "APP" 
	
	
	