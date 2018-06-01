module books.inmemory.storage {

    requires transitive books.storage.api;
    exports books.inmemory.storage.entities;
    exports books.inmemory.storage.service;

}