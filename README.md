##### Release 3.1
# BOOLOG for JUnit Testing

<hr>

*Java version [here](https://github.com/william-hood/boolog-java)*

*Kotlin version [here](https://github.com/william-hood/boolog-kotlin)*

*Go version [here](https://github.com/william-hood/boolog-go)*

*Rust version [here](https://github.com/william-hood/boolog-rust)*

<hr>
<img align="left" src="examples/boolog-logo-sm.gif">

**Boolog Rich Logging System - Direct-to-HTML**

Boolog allows your Java program to log directly to an HTML file. This will help developers and managers alike better
visualize what goes on with back-end processes, such as a cloud service or a test suite against REST API calls.
(Boolog is the "spiritual" successor of an automated test logger project created at one of the author's previous places of employment.)


Boolog for JUnit provides for proper use of the Boolog logging system via the JUnit Test Framework in Java.

### To use Boolog in your JUnit test project, update `pom.xml` by including the dependency as shown in the Maven Central Repository: https://central.sonatype.com/artifact/io.github.william-hood/boolog-junit

---
## Example Code
For usage, refer to this example program and the JavaDoc comments.

[Top Level Log Management Class](src/test/java/TopLevel.java) - You should copy this file into your JUnit test project.

[Template / Example Test Script 1](src/test/java/JUnit_Boolog_Example_Template.java)

[Example Test Script 2](src/test/java/More_Interesting_Test_Example.java)

By default, logs will be written to `(home)/Documents/Test Results/File Name.html`. Configure this in `TopLevel.java` with the `outputFile` variable.

## Supported Themes

[Themes Poster (GIF)](examples/Poster.gif)

GitHub won't let me directly link to the HTML examples showing each theme (it forces it to resolve as HTML source code).
Instead, I've bundled the examples into a ZIP archive that you can preview on your computer.

![Do this...](examples/Instructions.gif)

To get the archive, click [here](examples/Theme-Examples.zip) and then click the "Download Raw File" icon at right.

---

**WINDOWS USERS MAY NEED TO FOLLOW THESE STEPS TO PROPERLY DISPLAY EMOJIS IN THE CONSOLE**

https://akr.am/blog/posts/using-utf-8-in-the-windows-terminal


---
## MIT License
Copyright (c) 2023, 2025 William Arthur Hood

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
of the Software, and to permit persons to whom the Software is furnished
to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included
in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.
