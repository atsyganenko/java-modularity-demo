module books.json.printer {

    requires transitive books.printer.api;
    requires java.logging;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;

    exports books.json.printer;
}