# Fejlesztői Dokumentáció

## Az alkalmazás célja

Az alkalmazás járművek adatait tölti be CSV fájlokból, és azokon programozási tételeket valósít meg.

## Eszközök

Az alkalmazás egy Java nyelven írt program, ami VSCode-dal készült. A Java projekt "No build tools" választással jött létre.

## Forrásfájlok

A forrásfájlok az src könyvtárban találhatók egységesen.

## Az App osztály

Az App osztály csak az alkalmazás indítását szolgálja.

## A Solution osztály

A Solution osztály szolgáltatja a megoldásokat. Minden egyes metódus egy-egy programozási tételt valósít meg.

Minden metódus kiírja az általa generált eredményt.

## A Store osztály

A Store osztály valósítja meg a fájlok beolvasását. Az ipari kód a tryReadCsvFile metódusban van megvalósítva, a readCsvFile metódus csak a hibakezelést valósítja meg.

## A Car osztály

A Car osztály objektumaiban tároljuk egy jármű adatait.