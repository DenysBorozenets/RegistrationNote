package com.denis.controller;

public interface RegexContainer {
    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";

    String NAME = "regex.registration.name.regexp";
    String ANY = "regex.registration.any.regexp";
    String LOGIN = "regex.registration.nickname.regexp";
    String GROUP = "regex.registration.group.regexp";

    String HOME_NUMBER = "regex.registration.numberHome.regexp";
    String MOBILE_NUMBER = "regex.registration.numberMobile.regexp";
    String SECOND_MOBILE_NUMBER = "regex.registration.secondNumberMobile.regexp";

    String EMAIL = "regex.registration.email.regexp";

    String INDEX = "regex.registration.index.regexp";
    String CITY = "regex.registration.city.regexp";
    String STREET = "regex.registration.street.regexp";
    String BUILDING = "regex.registration.building.regexp";
    String FLAT = "regex.registration.flat.regexp";

    String DATE = "regex.registration.date.regexp";
}
