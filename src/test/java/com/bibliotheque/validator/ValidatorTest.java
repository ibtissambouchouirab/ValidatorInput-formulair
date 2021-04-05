package com.bibliotheque.validator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidatorTest {

    @Test
    void should_verify_email_is_ok() {
        Assertions.assertThat(Validator.isEmailValid("myname@email.com")).isTrue();
        Assertions.assertThat(Validator.isEmailValid("my.name@email.com")).isTrue();
        Assertions.assertThat(Validator.isEmailValid("my_name.not@email.com")).isTrue();
    }

    @Test
    void should_verify_email_is_not_ok() {
        Assertions.assertThat(Validator.isEmailValid("myname_email.com")).isFalse();
        Assertions.assertThat(Validator.isEmailValid("my.name@.com")).isFalse();
        Assertions.assertThat(Validator.isEmailValid("my_name.not@emailcom")).isFalse();
        Assertions.assertThat(Validator.isEmailValid("my_namenotemailcom")).isFalse();
        Assertions.assertThat(Validator.isEmailValid(" ")).isFalse();
    }

    @Test
   void should_verify_password_is_ok(){
        Assertions.assertThat(Validator.isPasswordValid("Paw@1234")).isTrue();
       // Assertions.assertThat(Validator.isPasswordValid("")).isTrue();
    }

    @Test
   void should_verify_password_is_not_ok(){
        Assertions.assertThat(Validator.isPasswordValid(" ")).isFalse();
        Assertions.assertThat(Validator.isPasswordValid("1234")).isFalse();
        Assertions.assertThat(Validator.isPasswordValid("abcd")).isFalse();
        Assertions.assertThat(Validator.isPasswordValid("1b")).isFalse();
        Assertions.assertThat(Validator.isPasswordValid("25Paw4!")).isFalse();
    }


    @Test
    void should_verify_name_is_ok() {
        Assertions.assertThat(Validator.isNameValid("Name")).isTrue();
        Assertions.assertThat(Validator.isNameValid("Nam4")).isTrue();
    }

    @Test
    void should_verify_name_is_not_ok() {
        Assertions.assertThat(Validator.isNameValid(" ")).isFalse();
        Assertions.assertThat(Validator.isNameValid("123")).isFalse();
        Assertions.assertThat(Validator.isNameValid("@A")).isFalse();
    }

}