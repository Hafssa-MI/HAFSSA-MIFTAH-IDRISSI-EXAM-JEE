import { Component, OnInit } from '@angular/core';
import { VehiculeService } from '../services/vehicule.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-vehicules',
  imports: [CommonModule],
  templateUrl: './vehicule.component.html',
  styleUrl: './vehicule.component.css'
})
export class VehiculeComponent implements OnInit {

  vehicules: any[] = [];
  errorMessage: string = '';

  constructor(private vehiculeService: VehiculeService) {}

  ngOnInit() {
    this.vehiculeService.getAllVehicules().subscribe({
      next: (data: any) => {
        this.vehicules = data;
      },
      error: err => {
        this.errorMessage = "Erreur de chargement des véhicules";
        console.log(err);
      }
    });
  }
}
