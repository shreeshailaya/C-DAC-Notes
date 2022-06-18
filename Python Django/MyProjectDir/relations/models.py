from django.db import models

# Create your models here.
class Album(models.Model):
    title = models.CharField(max_length = 100)
    artist = models.CharField(max_length = 100)

    def __str__(self):
        return self.title

class Song(models.Model):
    title = models.CharField(max_length = 100)
    album = models.ForeignKey(Album, on_delete = models.CASCADE)

    def __str__(self):
        return self.title


class Author(models.Model):
    name = models.CharField(max_length = 100)
    desc = models.TextField(max_length = 300)

    def __str__(self):
        return self.name

    

class Book(models.Model):
    title = models.CharField(max_length = 100)
    desc = models.TextField(max_length = 300)
    authors = models.ManyToManyField(Author)

    def __str__(self):
        return self.title

class Vehicle(models.Model):
    reg_no = models.IntegerField()
    owner = models.CharField(max_length = 100)

    def __str__(self):
        return str(self.owner)


class Car(models.Model):
    vehicle = models.OneToOneField(Vehicle,
		on_delete = models.CASCADE, primary_key = True)
    car_model = models.CharField(max_length = 100)

    def __str__(self):
        return self.car_model