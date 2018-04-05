# realm-js-private

# Building and running the tests:

1. Make sure the git submodules are updated and initialized (`git submodule update --init --recursive`)
2. Download the [`realm-core`](https://github.com/realm/realm-core) and [`realm-sync`](https://github.com/realm/realm-sync) sources in a convenient location
3. run `sh build.sh build-node` on both core and sync, after you have checkout the right versions of each, as specified in [`dependencies.list`](dependencies.list)
4. run `REALM_CORE_PREFIX=/path/to/realm-core REALM_SYNC_PREFIX=/path/to/realm-sync npm install  --build-from-source --debug` to build
    - Note that the paths need to be absolute. GYP does not like relative paths.
    - If you want to link again debug versions of core and sync you can add `--use_realm_debug` to the npm invocation. Plain `--debug` just builds the binding itself in debug.

    example of build command: 
    `REALM_CORE_PREFIX=$(pwd)/../realm-core REALM_SYNC_PREFIX=$(pwd)/../realm-sync npm install  --build-from-source --debug`

5. run `scripts/install-js-sync-server.sh ` to download the sync server
6. run `npm test` to run the tests
