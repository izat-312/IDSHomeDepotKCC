$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/features/GiftCardsPage.feature");
formatter.feature({
  "name": "Test HomeDepot GiftCard page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check Gift Cards Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@gifts"
    }
  ]
});
formatter.step({
  "name": "click gift card button",
  "keyword": "When "
});
formatter.match({
  "location": "GiftCardSteps.click_gift_card_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "gift card page should be open",
  "keyword": "Then "
});
formatter.match({
  "location": "GiftCardSteps.gift_card_page_should_be_open()"
});
formatter.result({
  "status": "passed"
});
});