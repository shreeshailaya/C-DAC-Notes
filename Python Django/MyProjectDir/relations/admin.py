from django.contrib import admin
from relations.models import Car, Vehicle
from relations.models import Album, Song, Author, Book

# Register your models here.
@admin.register(Vehicle)
class Vehicle(admin.ModelAdmin):
    pass

@admin.register(Car)
class Car(admin.ModelAdmin):
    pass