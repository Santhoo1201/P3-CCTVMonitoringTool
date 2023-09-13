import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateDvr1DetailsComponent } from './create-dvr1-details.component';

describe('CreateDvr1DetailsComponent', () => {
  let component: CreateDvr1DetailsComponent;
  let fixture: ComponentFixture<CreateDvr1DetailsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CreateDvr1DetailsComponent]
    });
    fixture = TestBed.createComponent(CreateDvr1DetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
