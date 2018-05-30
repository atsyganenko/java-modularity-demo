
javac --module-source-path . -d out $(find . -name '*.java') -m books.storage.api,main,books.inmemory.storage

java --module-path out -m main/main.bookapp.BookApp;