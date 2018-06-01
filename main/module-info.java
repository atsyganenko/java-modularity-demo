module main {
    requires books.inmemory.storage;
    requires guice;
    requires books.printer.api;
    uses books.printer.api.BookPrinter;
}