Given(/^I am on the home page$/) do
 visit 'https://www.youtube.com'
end

When /^I fill in "([^"]*)" with "([^"]*)"$/ do |element, text|
 fill_in element, :with => text
end

Then(/^I should visit "(.*?)"$/) do |text|
  resultados = all('a').map { |a| a['href'] }
  if not resultados.include?(text)
   raise "No se encontro el vídeo"
  end
  visit(text)
  #click_on('avatar')
  #page.should have_content text
  # page.driver.resize(20,30)
  page.save_screenshot("test1.png")
  # puts page.within_window
  # puts page.driver.network_traffic
  #puts page.driver.cookies
  #page.response_headers.to_a
end

Then(/^I should watch the video "(.*?)"$/) do |text|
  resultados = all('a').map { |a| a['href'] }
  if not resultados.include?(text)
   raise "No se encontro el vídeo"
  end
  visit(text)
  #click_on('avatar')
  #page.should have_content text
  # page.driver.resize(20,30)
  page.save_screenshot("test2.png")
  # puts page.within_window
  # puts page.driver.network_traffic
  #puts page.driver.cookies
  #page.response_headers.to_a
end

And("Click on {string}") do |string|
  click_on(string)
end

Then("like the video") do
  click_on("button")
end

Then("dislike the video") do
  click_on("button")
end

Given("I am on the home page and sing up") do
  visit 'https://www.youtube.com'
  click_on('Iniciar sesión')
  #page.save_screenshot("test3png")
end

When("Coninue on {string}") do |string|
  find('#'+string).click
end

Then("Finish on {string}") do |string|
  find('#'+string).click
end


