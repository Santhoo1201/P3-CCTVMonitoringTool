import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Dvr1DetailsSinglereportComponent } from './dvr1-details-singlereport.component';

describe('Dvr1DetailsSinglereportComponent', () => {
  let component: Dvr1DetailsSinglereportComponent;
  let fixture: ComponentFixture<Dvr1DetailsSinglereportComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Dvr1DetailsSinglereportComponent]
    });
    fixture = TestBed.createComponent(Dvr1DetailsSinglereportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
