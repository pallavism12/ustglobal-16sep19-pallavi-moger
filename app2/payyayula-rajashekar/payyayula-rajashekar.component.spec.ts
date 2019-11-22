import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PayyayulaRajashekarComponent } from './payyayula-rajashekar.component';

describe('PayyayulaRajashekarComponent', () => {
  let component: PayyayulaRajashekarComponent;
  let fixture: ComponentFixture<PayyayulaRajashekarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PayyayulaRajashekarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PayyayulaRajashekarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
