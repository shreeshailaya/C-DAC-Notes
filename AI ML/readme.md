### Difference in Pytorch/Tensorflow/Transformer
### Why getting Start With Pytorch 
### What is Pytorch  

## Quick Start with PyTorch
- Setup Virtual Environment
- Install Torch 
    - `pip install torch`
- Test PyTorch Installed 
```py
import torch
```

# Tensor
- Tensor special data structure like list and array
- We use tensors to encode the inputs and outputs of a model, as well as the model’s parameters. 
- Tensors are similar to NumPy’s ndarrays
- Tensor uses special GPU or hardware to execute

## Tensor Initialization
```py
data = [[1, 2], [3, 4]]
x_data = torch.tensor(data)
```
### From Numpy Array
- Tensor can created from Numpy array 
```py
np_array = np.array(data)
x_np = torch.from_numpy(np_array)
```
