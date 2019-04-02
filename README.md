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
