# Generated by Django 3.1.6 on 2021-02-16 06:54

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('Product', '0001_initial'),
    ]

    operations = [
        migrations.AddField(
            model_name='product',
            name='price',
            field=models.IntegerField(default=2),
            preserve_default=False,
        ),
    ]