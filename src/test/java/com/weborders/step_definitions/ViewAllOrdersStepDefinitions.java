package com.weborders.step_definitions;

import com.weborders.pages.ViewAllOrdersPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ViewAllOrdersStepDefinitions {

    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();

    @Then("I shoud be able to see following columns:")
    public void i_shoud_be_able_to_see_following_columns(List<String> dataTable) {
        Assert.assertEquals(dataTable,viewAllOrdersPage.getColumnNames());
    }

}
