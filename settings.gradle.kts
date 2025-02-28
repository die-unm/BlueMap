rootProject.name = "BlueMap"

// setup workspace
val releaseNotesFile = file("release.md")
if (!releaseNotesFile.exists()) releaseNotesFile.createNewFile();

// bluemap
includeBuild("BlueMapCore")
includeBuild("BlueMapCommon")

// implementations
includeBuild("implementations/cli")

includeBuild("implementations/fabric-1.18")
includeBuild("implementations/fabric-1.19")
includeBuild("implementations/fabric-1.19.4")
includeBuild("implementations/fabric-1.20")

includeBuild("implementations/forge-1.18.1")
includeBuild("implementations/forge-1.19.4")
includeBuild("implementations/forge-1.20")

includeBuild("implementations/neoforge-1.20.2")

includeBuild("implementations/spigot")
includeBuild("implementations/paper")

includeBuild("implementations/sponge")
