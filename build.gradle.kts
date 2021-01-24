plugins {
    id("org.danilopianini.git-sensitive-semantic-versioning") version "0.2.3"
}

group = "io.github.enrignagna"

gitSemVer {
    version = computeGitSemVer()
}

repositories {
    jcenter()
}


