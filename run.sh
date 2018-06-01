
javac -cp 'lib/*' --module-source-path . --module-path mods -d out $(find . -name '*.java')

java -cp 'lib/*' --add-opens java.base/java.lang=guice --module-path out:mods -m main/main.bookapp.BookApp