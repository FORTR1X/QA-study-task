Feature: Purchases by filter
  Getting information about purchases

  Scenario: Purchases by filter
    Given In footer "223-ФЗ", go to "Поставщикам"
    When Click "Расширенный поиск" button
    Then Open filter settings
    And In "Правило проведения" click "615-ПП РФ" checkbox
    And In "Быстрые настройки" click "Исключить совместные закупки" checkbox
    And In "Регион поставки" click "Алтайский край" checkbox
    And In "Фильтры по датам", in "ПОДАЧА ЗАЯВОК", from "13-05-2022" to "13-07-2022"
    And Click search button