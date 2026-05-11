import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AuthService } from './auth.service';

@Injectable({ providedIn: 'root' })
export class VehiculeService {

  constructor(private http: HttpClient, private authService: AuthService) {}

  getAllVehicules() {
    let headers = new HttpHeaders().set("Authorization", "Bearer " + this.authService.accessToken);
    return this.http.get("http://localhost:8085/api/vehicules", { headers });
  }
}
