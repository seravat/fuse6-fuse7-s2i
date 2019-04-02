# fuse6-fuse7-s2i

Example of migration from fuse 6.3 standalone to fuse 7 on openshift, using the Openshift S2I tool to build and deploy the application.

## Setup a binaries repository to act as a mirror

`https://github.com/seravat/openshift-nexus`

## Create a new build

Based on the fuse-karaf-openshift builder image and a github repository with a fuse project, create a new build on openshift:

`oc new-build fuse-karaf-openshift~https://github.com/seravat/fuse6-fuse7-s2i.git -e MAVEN_MIRROR_URL='http://nexus.nexus.svc:8081/repository/maven-public/' -e ARTIFACT_DIR=.`

## Verify the build

Get the id of the build

`oc get pods`

Follow the logs

`oc logs -f fuse6-fuse7-s2i-10-build`

## Issues

On Openshift Build:

Failed to execute goal org.apache.maven.plugins:maven-install-plugin:3.0.0-M1:install (default-install) on project artifacts: Execution default-install of goal org.apache.maven.plugins:maven-install-plugin:3.0.0-M1:install failed: Plugin org.apache.maven.plugins:maven-install-plugin:3.0.0-M1 or one of its dependencies could not be resolved: Failed to collect dependencies at org.apache.maven.plugins:maven-install-plugin:jar:3.0.0-M1 -> org.apache.maven.shared:maven-artifact-transfer:jar:0.10.0 -> commons-codec:commons-codec:jar:1.11: Failed to read artifact descriptor for commons-codec:commons-codec:jar:1.11: Could not transfer artifact commons-codec:commons-codec:pom:1.11 from/to mirror.default (http://nexus.nexus.svc:8081/repository/maven-public/): Failed to transfer file: http://nexus.nexus.svc:8081/repository/maven-public/commons-codec/commons-codec/1.11/commons-codec-1.11.pom. Return code is: 503 , ReasonPhrase:Service Unavailable.

Aborting due to error code 1 from mvn command
error: build error: non-zero (13) exit code from registry.access.redhat.com/fuse7/fuse-karaf-openshift@sha256:b220bd6c15057c098f561a45122e105bf50b63edfbf8b04f1ec6b60481a0bdff


