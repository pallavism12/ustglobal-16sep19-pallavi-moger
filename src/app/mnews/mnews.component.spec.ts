import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MnewsComponent } from './mnews.component';

describe('MnewsComponent', () => {
  let component: MnewsComponent;
  let fixture: ComponentFixture<MnewsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MnewsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MnewsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
