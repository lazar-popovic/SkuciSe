import { Component, OnInit } from '@angular/core';
import { Advertisements } from '../models/advertisements';
import { AdvertisementService } from '../services/advertisement.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  advertisements?:Advertisements[];

  constructor(private advService:AdvertisementService) { }

  ngOnInit(): void {
    this.advService.getAdveritesements().subscribe(adv =>{
      this.advertisements = adv;
    })
  }

}
