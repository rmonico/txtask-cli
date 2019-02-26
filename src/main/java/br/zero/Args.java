package br.zero;

public class Args {
    private String home;

    public static Args parse(String... arguments) {
        Args args = new Args();

        for (int i = 0; i < arguments.length; ) {
            String arg = arguments[i];

            boolean onLastArgument = i == arguments.length -1;

            if ("rc.home".equals(arg)) {
                if (onLastArgument)
                    throw new CLIArgParserException("'rc.home' switch must have a value");

                String value = arguments[i + 1];

                args.home(value);

                i += 2;
            } else {
                i++;
            }
        }

        return args;
    }

    public String home() {
        return this.home;
    }

    public void home(String value) {
        this.home = value;
    }
}
