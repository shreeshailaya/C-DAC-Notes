### Difference in Pytorch/Tensorflow/Transformer
### Why getting Start With Pytorch 
### What is Pytorch  
- Pytorch is advanced version of Numpy
- Pytorch runs on GPU 
- Pytorch uses CUDA i.e NVDIA driver to process data 

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
### Python List , Numpy Array and Tensor
- Python List
```py
my_list = [1,2,[3,4],5,6]
```
- Numpy Array
```py
np1 = np.random.rand(3,4)
np1
```
- Output
```
array([[0.40794251, 0.27295551, 0.86577454, 0.45733012],
       [0.46489365, 0.59418385, 0.00305332, 0.55114986],
       [0.87163135, 0.77306722, 0.06687424, 0.55792719]])
```
- Tensor from python List
```py
data = [[1, 2], [3, 4]]
x_data = torch.tensor(data)
x_data
```
- output
```
tensor([[1, 2],
        [3, 4]])
```

- When you convert python list to tensor then it will convert data type of list to tensor
- 2D Tensor
```py
tensor_2d = torch.randn(2,3)
```
- Output 
```
tensor([[ 0.1144, -1.2934,  0.1960],
        [ 0.3705, -2.9345, -1.1993]])
```
- 3D Tensor 
```python 
tensor_2d = torch.randn(2,3,4)
```
- Output 
```
tensor([[[ 0.1642,  0.6547, -1.0736,  1.1618],
         [-0.5776,  0.0124,  0.4960, -0.3375],
         [ 0.2768, -0.7412, -0.6478,  1.7044]],

        [[-0.2970, -0.7360, -0.9233,  0.9206],
         [ 1.9468, -0.8076, -1.3798, -0.2174],
         [-0.2121,  0.4512, -0.1052, -1.2942]]])
```

- In randn(2-dataset , 3-rows , 4 columns)

### Numpy to Tensor 

```py
np1 = np.random.rand(3,4)
tensor_arr = torch.tensor(np1)
```
- Output 
```
tensor([[0.4610, 0.5708, 0.9274, 0.6384],
        [0.1473, 0.2505, 0.4923, 0.9235],
        [0.2438, 0.1757, 0.3974, 0.0782]], dtype=torch.float64)
```
- It will keep data type of values (i.e float) as it is.

### Tensor Operations 
#### arange()
```py
my_torch = torch.arange(10)
```
- It will create tensor of 0-9

#### reshape and view 
- reshape convert tensor into 2d or 3d array 
```py
my_torch = torch.arange(10)
my_torch1 = my_torch.reshape(2,5)
```
- In above example the arange is size of 10 so it will easy convert into 2/5
- But you gave 3/5 it will throw error 
- To tackle that we have -1 if we don't know the shape/size of array 
```py
my_torch1 = my_torch.reshape(2,-1)
```


