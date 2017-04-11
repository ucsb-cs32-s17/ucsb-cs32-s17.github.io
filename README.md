# ucsb-cs32-s17.github.io

https://ucsb-cs32-s17.github.io website

To test locally:
* One time setup:
    * `git clone` the repo
    * Install rvm (the Ruby version manager)
    * Run `./setup.sh` to install correct ruby version, bundler version, and bundle the gems
* From then on, to test the site locally:
    * Run `./jekyll.sh`
    * Point browser to localhost:4000


# Hints for converting material from the legacy wiki

There materials for Conrad's instances of CS32 from S15 and F15 in a Mediawiki site here: https://foo.cs.ucsb.edu/32wiki

The long term plan is to harvest everything useful from that site, put in into https://ucsb-cs32.github.io or into this site, and then get rid of the Mediawiki site.

Here are some hints for doing that.

(1) You can use the `pandoc` utility to convert from mediawiki syntax to markdown syntax.   Edit the mediawiki page (or view its source), copy/paste it into a document with a .mw extension, then do something like:

```
pandoc --from=mediawiki --to=markdown old.mw new.md
```

There may be parts that don't convert nicely.  For those, it may be better to just go back to the wiki page and get the raw HTML.  If there are embedded CSS classes, the place to look for the CSS that goes with them is here:

https://foo.cs.ucsb.edu/32wiki/index.php/MediaWiki:Common.css
