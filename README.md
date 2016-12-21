![alt tag](https://github.com/di-unipi-socc/FogTorch/blob/master/img/logo.png)

A tool for QoS-aware deployment of IoT applications through the Fog. 

FogTorch is based upon the formal model described in

> Antonio Brogi and Stefano Forti <br>
> **QoS-aware Deployment of IoT Applications Through the Fog.** <br>
> Technical Report, Dept. of Computer Science, University of Pisa, Italy

If you wish to reuse source code in this repo, please cite the above mentioned technical report. The appropriate BibTex is reported below:

```
@book{fogtorch,
          author = {Antonio Brogi and Stefano Forti},
          volume = {Technical Report},
          title = {QoS-aware Deployment of IoT Applications Through the Fog},
          publisher = {University of Pisa},
          month = {November},
          year = {2016},
          url = {http://eprints.adm.unipi.it/2362}
			 
}
```

# A brief intro to FogTorch

FogTorch inputs the specification of a Fog infrastructure ```I``` along processing (CPU cores, RAM, storage) and QoS (latency, bandwidth) capabilities, and the specification of an application ```A``` to be deployed, along with needed IoT devices, processing (CPU cores, RAM, storage) and QoS (latency, bandwidth) requirements.

The output is either one or all eligible deployments of ```A``` on ```I``` that meet all processing and QoS constraints.

