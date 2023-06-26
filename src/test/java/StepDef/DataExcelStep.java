package StepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class DataTableStep {

    @Given("There is data")
    public void there_is_data(DataTable dataTable) {
        List<String> name = dataTable.asList(String.class);
        String str = name.get(0);
        System.out.println(str);
        String str1 = name.get(1);
        System.out.println(str1);
    }
    @Then("Print the data")
    public void print_the_data(DataTable dataTable) {
        List<Map<String, String>> details =dataTable.asMaps(String.class, String.class);

        System.out.println(details.get(0).get("name"));
        System.out.println(details.get(0).get("email"));

        System.out.println(details.get(1).get("name"));
        System.out.println(details.get(1).get("email"));





    }

}
