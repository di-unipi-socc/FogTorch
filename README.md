<img src="https://github.com/di-unipi-socc/FogTorch/blob/master/img/logoft.PNG" width="300">

_A tool for QoS-aware deployment of IoT applications through the Fog._

FogTorch is based upon the formal model described in

> Antonio Brogi and Stefano Forti <br>
> [**QoS-aware Deployment of IoT Applications Through the Fog.**](http://ieeexplore.ieee.org/document/7919155/) <br>
>  in _IEEE Internet of Things Journal_ , vol.PP, no.99, 2017

If you wish to reuse source code in this repo, please cite the above mentioned technical report. The appropriate BibTex is reported below:

```
@article{fogtorch, 
	author={A. Brogi and S. Forti}, 
	journal={IEEE Internet of Things Journal}, 
	title={QoS-aware Deployment of IoT Applications Through the Fog}, 
	year={2017}, 
	volume={PP}, 
	number={99}, 
	pages={1-1}, 
	keywords={IoT;QoS-aware deployment;fog computing}, 
	doi={10.1109/JIOT.2017.2701408}, 
	ISSN={2327-4662}, 
	month={}}
```

# A brief intro to FogTorch

FogTorch inputs the specification of a Fog infrastructure ```I``` along processing (CPU cores, RAM, storage) and QoS (latency, bandwidth) capabilities, and the specification of an application ```A``` to be deployed, along with needed IoT devices, processing (CPU cores, RAM, storage) and QoS (latency, bandwidth) requirements.

The output is either one or all eligible deployments of ```A``` on ```I``` that meet all processing and QoS constraints.

