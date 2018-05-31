package dariy.cursor.dariyspringbootstarter.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class InfoMessage implements EnvironmentPostProcessor {


    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        System.out.println("                                                \n" +
                "  ####  #####   ##   #####  ##### ###### #####  \n" +
                " #        #    #  #  #    #   #   #      #    # \n" +
                "  ####    #   #    # #    #   #   #####  #    # \n" +
                "      #   #   ###### #####    #   #      #####  \n" +
                " #    #   #   #    # #   #    #   #      #   #  \n" +
                "  ####    #   #    # #    #   #   ###### #    # \n" +
                "                                                ");
    }
}
