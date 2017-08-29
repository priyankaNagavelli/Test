$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddCheckBasket.feature");
formatter.feature({
  "line": 1,
  "name": "Check shopping basket",
  "description": "As a customer\r\nI want to add computer kit bundle and check shopping basket\r\nSo that I can checkout",
  "id": "check-shopping-basket",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#Background:"
    },
    {
      "line": 7,
      "value": "#Given am on Kano_site"
    }
  ],
  "line": 9,
  "name": "Add computer bundle and check shopping basket",
  "description": "",
  "id": "check-shopping-basket;add-computer-bundle-and-check-shopping-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "am on Kano_site",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on shop tab on menu",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on \u0027computer kit bundle\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "click on \u0027buy now\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see \u0027computer kit bundle\u0027 in \u0027your kano order\u0027",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});