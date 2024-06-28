# useful information for kotlin programming
a list of stuff that helps me to program using kotlin
mostly could be avoided using an IDE but i like things
the hard way.

## how to compile a .kt file
```bash
kotlinc InputFileName.kt -include-runtime -d OutputFileName.jar
```

## how to run a jar file
this for files with a main function
```bash
java -jar OutputFileName.jar
```

this for files without a main function
```bash
java -cp OutputFileName.jar com.mypackage.Name
```
