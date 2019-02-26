package br.zero;

import java.util.ArrayList;
import java.util.List;

public class Args {
    private String home;

    public static Args parse(String... arguments) {
        Args args = new Args();

        args.doParse(arguments);

        return args;
    }

    private void doParse(String[] arguments) {
        for (int i = 0; i < arguments.length; ) {
            String arg = arguments[i];

            boolean onLastArgument = i == arguments.length -1;

            if ("rc.home".equals(arg)) {
                if (onLastArgument)
                    throw new CLIArgParserException("'rc.home' switch must have a value");

                String value = arguments[i + 1];

                this.home(value);

                i += 2;
            } else
                i++;
        }

        this.checkRequiredSwitches();
    }

    private void checkRequiredSwitches() {
        if (this.home == null)
            throw new CLIArgParserException("'rc.home' is required!");
    }

    public String home() {
        return this.home;
    }

    public void home(String value) {
        this.home = value;
    }

    public List<String> filter() {
        return new ArrayList<>();
    }
}
