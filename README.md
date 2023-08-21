# Most Used Apache Camel Example with Spring boot
Reading from and writing to files in Apache Camel


I followed this [tutorial]([url](https://fabian-kostadinov.github.io/2016/01/10/reading-from-and-writing-to-files-in-apache-camel/)https://fabian-kostadinov.github.io/2016/01/10/reading-from-and-writing-to-files-in-apache-camel/) but I just changed how to write the file URI

Instead of using 
```
file://C:\\in\\MyFile.txt
```
I used 
```
from("file:/home/mahmoudxyz/Downloads/camel/files/input/?fileName=test2.html&noop=true")

```
