import scala.io.Source
import edu.holycross.shot.scm._



val header="""
# Library of texts demonstrating CTS

# The pound sign "#" is used as a column divider.

#!cexversion
1.0

#!citelibrary

name#CTS-Demonstration 2017
urn#urn:cite2:furman:cex.2017a:demo
license#Creative Commons Attribution Share Alike

"""


val propertiesFile = "repository.properties"
val cex = LocalFileConverter.textCexFromPropertiesFile(propertiesFile, "#")


import java.io.PrintWriter
new PrintWriter("library.cex"){ write(header + cex); close;}
