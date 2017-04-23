# CEX-Maker package

An `sbt` project for creating [`.cex` digital libraries](https://github.com/cite-architecture/scm/wiki/Creating-a-CITE-libraryj) from XML, Plain-text, or Markdown texts.

`.cex` is the CITE Exchange Format. It is the format for digital library data used by the [CiteApp](https://github.com/cite-architecture/CITE-App).

Requires [SBT](http://www.scala-sbt.org).

## Instructions

To build the included demonstration texts:

- In a terminal, navigate to this directory, *e.g.* `cd ~/cex-maker`
- `sbt console`
- `:load buildcex.sc`

If all goes well, this will create `library.cex` at the root level of this directory.

## Where things are

- `repository.properties` : identifies the Inventory, Citation Config, and Text directory (see below)
- `text-archive/inventory.xml` : a CTS TextInventory
- `text-archive/citationconfig.xml` : a CTS Citation Configuration file
- `text-archive/texts/…` : the included sample texts, XML and Markdown
