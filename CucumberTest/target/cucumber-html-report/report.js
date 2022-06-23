$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/features2.feature");
formatter.feature({
  "line": 1,
  "name": "Taslak Deneme2",
  "description": "",
  "id": "taslak-deneme2",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "deneme2",
  "description": "",
  "id": "taslak-deneme2;deneme2",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "\"Trendyol\" ana sayfası açılır",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "\"ssd\" kelimesi aratılır",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Herhangi bir ürün seçilir",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Trendyol",
      "offset": 1
    }
  ],
  "location": "HomePageSteps.ana_sayfası_açılır(String)"
});
formatter.result({
  "duration": 3432476200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ssd",
      "offset": 1
    }
  ],
  "location": "SearchBarSteps.kelimesi_aratılır(String)"
});
formatter.result({
  "duration": 1862819600,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageSteps.herhangi_bir_ürün_seçilir()"
});
formatter.result({
  "duration": 313733800,
  "status": "passed"
});
formatter.after({
  "duration": 2625693500,
  "status": "passed"
});
});