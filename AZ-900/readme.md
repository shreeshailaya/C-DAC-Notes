# Azure Fundamentals 
![azure](https://wallpaperaccess.com/full/2670514.jpg)
## What is cloud computing
- Cloud computing is the delivery of computing services over the internet.
- Computing services include common IT infrastructure such as virtual machines, storage, databases, and networking
- Cloud services also expand the traditional IT offerings to include things like Internet of Things (IoT), machine learning (ML), and artificial intelligence (AI).
- Because cloud computing uses the internet to deliver these services, it doesn’t have to be constrained by physical infrastructure the same way that a traditional datacenter is.
- That means if you need to increase your IT infrastructure rapidly, you don’t have to wait to build a new datacenter—you can use the cloud to rapidly expand your IT footprint.

## Cloud Models 
### Private Cloud 
- A private cloud is, in some ways, the natural evolution from a corporate datacenter. It’s a cloud (delivering IT services over the internet) that’s used by a single entity.
- Private cloud provides much greater control for the company and its IT department.
### Public Cloud 
- A public cloud is built, controlled, and maintained by a third-party cloud provider
-  With a public cloud, anyone that wants to purchase cloud services can access and use resources.
- The general public availability is a key difference between public and private clouds.

### Hybrid Cloud 
- A hybrid cloud is a computing environment that uses both public and private clouds in an inter-connected environment
- Hybrid cloud can be used to provide an extra layer of security. For example, users can flexibly choose which services to keep in public cloud and which to deploy to their private cloud infrastructure.
### Multi Cloud 
### Azure Arc
---
## Describe the consumption-based model
- When comparing IT infrastructure models, there are two types of expenses to consider. Capital expenditure (CapEx) and operational expenditure (OpEx).
- CapEx is typically a one-time, up-front expenditure to purchase or secure tangible resources. A new building, repaving the parking lot, building a datacenter, or buying a company vehicle are examples of CapEx.
- Cloud computing falls under OpEx because cloud computing operates on a consumption-based model. 

- This consumption-based model has many benefits, including:
    - No upfront costs.
    - No need to purchase and manage costly infrastructure that users might not use to its fullest potential.
    - The ability to pay for more resources when they're needed.
    - The ability to stop paying for resources that are no longer needed.

- In a cloud-based model, you don’t have to worry about getting the resource needs just right. If you find that you need more virtual machines, you add more
-  If the demand drops and you don’t need as many virtual machines, you remove machines as needed. Either way, you’re only paying for the virtual machines that you use, not the “extra capacity” that the cloud provider has on hand.
---
## High availability and Scalability
- When building or deploying a cloud application, two of the biggest considerations are uptime (or availability) and the ability to handle demand (or scale).

### High availability 
- When you’re deploying an application, a service, or any IT resources, it’s important the resources are available when needed. 
- High availability focuses on ensuring maximum availability, regardless of disruptions or events that may occur.
- When you’re architecting your solution, you’ll need to account for service availability guarantees. 
- These guarantees are part of the service-level agreements (SLAs).

### SLA ( Service Level Agreement )
- SLA is a standard industry term
- It's a formal agreement between service provider and the customer guarantees customer a state level of service 
- SLA in azure represent availability of azure service
- If the service is available 100% up time then the SLA is 100%
- In reality 100% SLA is impossible 
- If you want more SLA than you have to pay more to Azure 
- So they can make replica/duplicate every single data point and component to make sure everything will go smooth even in maintenance and upgrade.
- So there is three SLA 99%, 99.9% and 99.95%
- 99.99% is also available in some services 
- Difference in 99% and 99.9% SLA
- 99% is service not available 1.68hrs in week and 7.2hrs for months 
- 99.9% is service not available 10min in week and 43.2min in month
- Depends on your business you can take SLA 

### Scalability
- Another major benefit of cloud computing is the scalability of cloud resources. Scalability refers to the ability to adjust resources to meet demand
- Scaling generally comes in two varieties: vertical and horizontal.
- Vertical scaling is focused on increasing or decreasing the capabilities of resources. Horizontal scaling is adding or subtracting the number of resources.
- With vertical scaling, if you were developing an app and you needed more/less processing power, you could vertically scale up to add/remove more CPUs or RAM to the virtual machine.
- With horizontal scaling, if you suddenly experienced a steep jump in demand, your deployed resources could be scaled out (either automatically or manually).For example, you could add additional virtual machines or containers, scaling out.

### Reliability
- Reliability is the ability of a system to recover from failures and continue to function. It's also one of the pillars of the Microsoft Azure Well-Architected Framework.
- With this global scale, even if one region has a catastrophic event other regions are still up and running. You can design your applications to automatically take advantage of this increased reliability

### Predictability
- Predictability in the cloud lets you move forward with confidence. Predictability can be focused on performance predictability or cost predictability. 
- Cost predictability is focused on predicting or forecasting the cost of the cloud spend
- By operating in the cloud and using cloud analytics and information, you can predict future costs and adjust your resources as needed. 
- You can even use tools like the Total Cost of Ownership (TCO) or Pricing Calculator to get an estimate of potential cloud spend.


### Performance
- Performance predictability focuses on predicting the resources needed to deliver a positive experience for your customers.
- Autoscaling, load balancing, and high availability are just some of the cloud concepts that support performance predictability.
---
## Services Types
## IAAS (  Infrastructure as a Service )
- Infrastructure as a service (IaaS) is the most flexible category of cloud services, as it provides you the **maximum amount of control** for your cloud resources.
- In an IaaS model, the cloud provider is responsible for maintaining the hardware, network connectivity (to the internet), and physical security.
- You’re responsible for everything else: operating system installation, configuration, and maintenance; network configuration; database and storage configuration; and so on.
- With IaaS, you’re essentially renting the hardware in a cloud datacenter, but what you do with that hardware is **up to you**.
- Some common scenarios where IaaS might make sense include:
    - Lift-and-shift migration
    - Testing and development
## PAAS ( Platform as a Service )
- Platform as a service (PaaS) is a middle ground between renting space in a datacenter (infrastructure as a service) and paying for a complete and deployed solution (software as a service).
- In a PaaS environment, the cloud provider maintains the physical infrastructure, physical security, and connection to the internet. 
- They also maintain the operating systems, middleware, development tools, and business intelligence services that make up a cloud solution.
- In a PaaS scenario, you don't have to worry about the licensing or patching for operating systems and databases.
- Some common scenarios where PaaS might make sense include:
    - Development framework
    - Analytics or business intelligence
        - Tools provided as a service with PaaS allow organizations to analyze and mine their data, finding insights and patterns and predicting outcomes to improve forecasting, product design decisions, investment returns, and other business decisions.
    - eg Heroku.
## SAAS ( Software as a Service )
- Software as a service (SaaS) is the most complete cloud service model from a product perspective.
- With SaaS, you’re essentially renting or using a fully developed application.
- Email, financial software, messaging applications, and connectivity software are all common examples of a SaaS implementation.
- While the SaaS model may be the least flexible, it’s also the easiest to get up and running. It requires the least amount of technical knowledge or expertise to fully employ.
- Some common scenarios for SaaS are:
    - Email and messaging.
    - Business productivity applications.
    - Finance and expense tracking.
---
## Shared responsibility model

![Shared responsibility model](https://docs.microsoft.com/en-us/learn/wwl-azure/describe-cloud-service-types/media/shared-responsibility-b3829bfe.svg)

---
# Core Architectural Components of Azure 

### Get started with Azure accounts
![Azure](https://docs.microsoft.com/en-us/learn/wwl-azure/describe-core-architectural-components-of-azure/media/account-scope-levels-9ceb3abd.png)

### Learn Power Shell and Bash
### Task-1 (use power shell)
- Use the PowerShell Get-date command to get the current date and time.
```Get-date```
- Most Azure specific commands will start with the letters az. 
```az version```
### Task-2 (Bash)
- Enter into bash command CLI  ```bash```
- ```Get-date``` is power shell specified command so it will not work in bash
- ```date``` is command for date in bash
- ```az upgrade``` to upgrade in bash
### Task-3 (Interactive Mode)
- To activate interactive mode use ```az interactive```
- Then try ```upgrade``` and ```version``` with interactive
- ```exit``` for exit from interactive mode

---
## Azure physical infrastructure
- The core architectural components of Azure may be broken down into two main groupings: the physical infrastructure, and the management infrastructure.

- The physical infrastructure for Azure starts with datacenters. Conceptually, the datacenters are the same as large corporate datacenters.
- They’re facilities with resources arranged in racks, with dedicated power, cooling, and networking infrastructure.

## Regions
- A region is a geographical area on the planet that contains at least one, but potentially multiple datacenters that are nearby and networked together with a low-latency network.
- Azure intelligently assigns and controls the resources within each region to ensure workloads are appropriately balanced.
- Some services or virtual machine (VM) features are only available in certain regions, such as specific VM sizes or storage types.
- There are also some global Azure services that don't require you to select a particular region, such as Azure Active Directory, Azure Traffic Manager, and Azure DNS.

## Availability Zones
- Availability zones are physically separate datacenters within an Azure region. 
- Each availability zone is made up of one or more datacenters equipped with independent power, cooling, and networking.
- If one zone goes down, the other continues working. Availability zones are connected through high-speed, private fiber-optic networks.
- ![Availability Zone](https://docs.microsoft.com/en-us/learn/wwl-azure/describe-core-architectural-components-of-azure/media/availability-zones-c22f95a3.png)

- Important :
    - To ensure resiliency, a minimum of three separate availability zones are present in all availability zone-enabled regions. However, not all Azure Regions currently support availability zones.

## Region pairs
- Most Azure regions are paired with another region within the same geography (such as US, Europe, or Asia) at least 300 miles away. 
- This approach allows for the replication of resources across a geography that helps reduce the likelihood of interruptions because of events such as natural disasters, civil unrest, power outages, or physical network outages that affect an entire region. 
- West US <==> East US
- West India => South India => Central 
- Brazil South => South Central US (Outside of region)

## Sovereign Regions
- US DoD Central, US Gov Virginia, US Gov Iowa and more: 
- China East, China North, and more: 

---


