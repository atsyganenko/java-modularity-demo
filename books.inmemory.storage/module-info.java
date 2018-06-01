module books.inmemory.storage {

    requires transitive books.storage.api;
    requires guice;
    exports books.inmemory.storage.service.guice;
    exports books.inmemory.storage.entities;
    opens books.inmemory.storage.service;
}