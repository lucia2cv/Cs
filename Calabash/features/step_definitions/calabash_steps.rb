require 'calabash-android/calabash_steps'

Given("I write a {string} into field with id {string}") do |string, string2|
	fill_in string, :with => string2
end

And("I write {string} into field with id {string}") do |string, string2|
	fill_in string, :with => string2
end

When("I press button with id {string}") do |string|
	click_on(string)
end

Then("I should see {string}") do |string|
	find('#'+string)
	page.save_screenshot("test"+string+".png")
end

And("I wait for button with id {string}") do |string|
	find('#'+string)
end

And("I deactivate "REBOTES"") do |string|
	click_on(string)
end