from django.http import HttpRequest, HttpResponse
from django.shortcuts import get_object_or_404, render
from utility.forms import ProductForm
from django.views.generic.edit import CreateView
from utility.models import Products
from django.contrib.auth.decorators import login_required

# Create your views here.
def index(request):
    return render(request, 'index.html')


def create_view(request):
    # dictionary for initial data with
    # field names as keys
    
    success = ''
    if request.method == "POST":
        form = ProductForm(request.POST, request.FILES)
        if form.is_valid():
            name = form.cleaned_data.get("name")
            price = form.cleaned_data.get("price")
            quantity = form.cleaned_data.get("quantity")
            img = form.cleaned_data.get("img")

            obj = Products.objects.create(
                                 name = name,
                                 price = price,
                                 quantity = quantity,
                                 img = img,
                                 seller = request.user
                                 )
            obj.save()
            print(name)
            success = 'Successfully saved data'
    else:
      form = ProductForm()

    # add the dictionary during initialization
    return render(request, "utilityTemp/create_view.html", {'form': form, 'success': success})

def products(request):
    products_data = Products.objects.all()
    return render(request, 'utilityTemp/products.html', {'products': products_data})


@login_required
def delete(request, id):
    
    obj = Products.objects.get(id=id)
    if obj.seller == request.user:
        obj.delete()
        return render(request, 'utilityTemp/products.html', {'success':'Successfully deleted Item'})
    else:
        return HttpResponse('<h2>Sorry you cannot delete this you are not the owner of this post </h2>')


@login_required
def update_view(request, id):
    success = ''
    # fetch the object related to passed id
    
    obj = Products.objects.get(id = id)
    print(obj.seller)
    if obj.seller == request.user:
        return render(request, "utilityTemp/update_view.html", {'object': obj, 'success':success})
    else: 
        return HttpResponse('<h2>Sorry you cannot edit this you are not the owner of this post </h2>')


def updateData(request):
    print(request.POST)
    
    id1 = request.POST['id']
    name1 = request.POST['name']
    price1 = request.POST['price']
    quantity1 = request.POST['quantity']

    print(id1)
    obj = get_object_or_404(Products, id = id1)
    obj.name = name1
    obj.price = price1
    obj.quantity = quantity1

    obj.save()
    
    return render(request, 'utilityTemp/products.html', {'success': 'Updated successfully'})

class ProductCreate(CreateView):
 
    # specify the model for create view
    model = Products
 
    # specify the fields to be displayed
 
    fields = ['name', 'price', 'quantity', 'img']

