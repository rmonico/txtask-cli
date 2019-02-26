package br.zero;

public class Args {
    private String home;

    public static Args parse(String... arguments) {
        Args args = new Args();

        for (int i = 0; i < arguments.length; ) {
            String arg = arguments[i];


            if ("rc.home".equals(arg)) {
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
