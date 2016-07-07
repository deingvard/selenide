package com.deingvard.selenide.example;

import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by igor on 07/07/2016.
 */
public class ToDoThoraxTest {

        @Test
        public void testCreateTask(){
            open("http://todomvc.com/examples/thorax/");
            $("#new-todo").setValue("do").pressEnter();
            $("#new-todo").setValue("go").pressEnter();

            $$("#todo-list li").shouldHave(exactTexts("do", "go"));
        }

    }

