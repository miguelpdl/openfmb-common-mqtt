![Logo of the Project](https://github.com/openfmb/dtech-demo-2016/blob/master/img/openfmb-tm-black_reduced_100.png)

# Description

This repository is the OpenFMB interface layer that creates java objects for producing the required XML for the MQTT Transport.  Additionally this layer provides the applicaiton interfaces  

# Installing / Getting started

This project is used in the Dtech Demo and builds the MQTT bindings for the Loadpubliser and other simulation that want to leverage MQTT.  Refer to [Wiki](https://github.com/openfmb/dtech-demo-2016/wiki) for information on DTech Demo. 

## Dependencies

Please refer to the Wiki pages for the [Demonstration](https://github.com/openfmb/turnkey-dtech-demo-2016/wiki/Simulation-Demonstration) and [Prerequisites](https://github.com/openfmb/turnkey-dtech-demo-2016/wiki/Simulation-Prerequisites) for the demo and these cooresponding repository projects. 

## Building

```shell
git clone https://github.com/openfmb/openfmb-common-mqtt.git
cd openfmb-common-mqtt/openfmb-core
mvn clean install
```
The build jar is put in the target directory and needs to be moved to the main directory where the properities files are located. 


## Configuration

There is no configuration for this repository.

# Contributing

David Lawrence, Duke Energy

Dwayne Bradley, Duke Energy

If you'd like to contribute, please fork the repository and use a feature
branch. Pull requests are warmly welcome.

Please review the [CONTRIBUTING](https://github.com/openfmb/openfmb-common-mqtt/blob/master/CONTRIBUTING.md) file. 

# License

See the [APACHE_FILE_HEADER](https://github.com/openfmb/openfmb-common-mqtt/blob/master/APACHE_FILE_HEADER) file for more info.
