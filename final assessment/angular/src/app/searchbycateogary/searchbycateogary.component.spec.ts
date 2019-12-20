import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchbycateogaryComponent } from './searchbycateogary.component';

describe('SearchbycateogaryComponent', () => {
  let component: SearchbycateogaryComponent;
  let fixture: ComponentFixture<SearchbycateogaryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchbycateogaryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchbycateogaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
